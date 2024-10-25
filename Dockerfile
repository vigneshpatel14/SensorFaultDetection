FROM python:3.8-slim-buster AS builder

WORKDIR /app
COPY requirements.txt /app/requirements.txt

# Attempt to install dependencies (errors won't block the next stage)
RUN pip install --no-cache-dir -r requirements.txt || true

# Second Stage: Final Image
FROM python:3.8-slim-buster

WORKDIR /app
COPY . /app/

# Optional: Copy installed packages from builder stage if needed
COPY --from=builder /usr/local/lib/python3.8/site-packages /usr/local/lib/python3.8/site-packages

# List installed packages for verification (won't stop build if it fails)
RUN pip freeze || true

CMD ["python3", "app.py"]