# Use the official Python 3.8 slim image as the base
FROM python:3.8-slim-buster

# Prevent Python from writing .pyc files and buffering stdout/stderr
ENV PYTHONDONTWRITEBYTECODE 1
ENV PYTHONUNBUFFERED 1

# Set the working directory in the container
WORKDIR /app

# Install essential system dependencies
RUN apt-get update && apt-get install -y --no-install-recommends \
    build-essential \
    libpq-dev \
    gcc \
    && rm -rf /var/lib/apt/lists/*

# Copy the requirements file first to leverage Docker's caching
COPY requirements.txt /app/requirements.txt

# Upgrade pip to the latest version
RUN pip install --no-cache-dir --upgrade pip

# Install the required Python packages from requirements.txt
RUN pip install --no-cache-dir -r requirements.txt

# Copy the rest of the application code into the container
COPY . /app/

# List the installed packages for verification
RUN pip freeze > installed-packages.txt

# Specify the command to run the application
CMD ["python3", "app.py"]