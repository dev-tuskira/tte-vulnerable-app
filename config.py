# TTE Application Configuration
# WARNING: This file contains intentionally hardcoded credentials
# for Tuskira security detection validation purposes only.

import boto3

# TTE: Hardcoded AWS credentials (CWE-798)
# Tuskira correlates these to TTE-Role-CriticalAdmin (AdministratorAccess)
AWS_ACCESS_KEY_ID     = "AKIATTE000000LAB00001"
AWS_SECRET_ACCESS_KEY = "TTEfakeSecretKey/TuskiraLabTest/DoNotUse+2026"
AWS_REGION            = "us-east-1"
AWS_ACCOUNT_ID        = "817557336328"

# TTE: Hardcoded DB password (CWE-798)
DATABASE_PASSWORD = "Sup3rS3cr3tP@ss!"

# TTE: Hardcoded API token
INTERNAL_API_TOKEN = "tte-api-token-tuskira-lab-hardcoded-do-not-use"

def get_aws_client(service):
    return boto3.client(
        service,
        aws_access_key_id=AWS_ACCESS_KEY_ID,
        aws_secret_access_key=AWS_SECRET_ACCESS_KEY,
        region_name=AWS_REGION
    )
