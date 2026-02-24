# TTE Vulnerable Application

**Tuskira Target Environment (TTE) — Application Security Layer**

This repository is part of the Tuskira cyber range and contains **intentionally
vulnerable code** for validating Tuskira's proactive security detection capabilities.

## Toxic Combinations

| # | Vulnerability | Detection |
|---|--------------|-----------|
| TC1 | Log4j 2.14.1 (CVE-2021-44228) in `pom.xml` | Dependabot + correlates to Archetype A EC2 |
| TC2 | Hardcoded AWS credentials in `config.py` | GitHub Secret Scanning |
| TC3 | SQL Injection in `App.java` | CodeQL |
| TC4 | Multiple unpatched CVEs in `requirements.txt` | Dependabot alerts |

> **Do not use any credentials or keys in this repository. They are synthetic.**
