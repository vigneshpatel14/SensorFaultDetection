# Use the official Python 3.8 slim image as the base
FROM python:3.8-slim-buster

# Set the working directory in the container
WORKDIR /app

# Copy the current directory contents into the container at /app
COPY . /app/

# Upgrade pip to the latest version
RUN pip install --upgrade pip

# Install the required Python packages from requirements.txt
RUN pip install -r requirements.txt || { echo 'Failed to install requirements'; exit 1; }

# List the installed packages for verification
RUN pip freeze

# Specify the command to run the application
CMD ["python3", "app.py"]
