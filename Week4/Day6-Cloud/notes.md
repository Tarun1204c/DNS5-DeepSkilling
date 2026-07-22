# Week4 Day6 - Cloud Computing Basics (Module 15)

## What is Cloud Computing?
Renting computing resources (servers, storage, databases) over the internet 
instead of buying and maintaining physical hardware yourself.

## Why Cloud Matters
- No need to buy/manage physical servers
- Pay only for what you use (pay-as-you-go)
- Easily scale up/down based on demand
- Access resources from anywhere

## Major Cloud Providers
- **AWS (Amazon Web Services)** - largest market share, most widely used
- **Microsoft Azure** - common in enterprise/Microsoft-based companies (likely used at Cognizant)
- **Google Cloud Platform (GCP)** - popular for data/ML workloads

## Cloud Service Models

### IaaS (Infrastructure as a Service)
Rent raw computing resources (virtual machines, storage, networking).
Example: AWS EC2, Azure Virtual Machines

### PaaS (Platform as a Service)
A ready platform to deploy your app without managing servers.
Example: AWS Elastic Beanstalk, Azure App Service

### SaaS (Software as a Service)
Fully built software you just use, no infrastructure management at all.
Example: Gmail, Salesforce, Microsoft 365

## Key AWS Services (commonly used)
- **EC2** - virtual servers to run applications (like our Spring Boot app)
- **S3** - object storage (files, images, backups)
- **RDS** - managed relational databases (MySQL, PostgreSQL)
- **Lambda** - serverless functions (run code without managing servers)

## Key Azure Services (commonly used)
- **Azure VMs** - equivalent to AWS EC2
- **Azure Blob Storage** - equivalent to AWS S3
- **Azure App Service** - deploy web apps easily (PaaS)
- **Azure SQL Database** - managed database service

## How This Connects to Our Learning
- Our Spring Boot app (Day6-SpringJPA) could be deployed on:
  - AWS EC2 (as a virtual server) or Azure VM
  - Or containerized with Docker and deployed on AWS ECS / Azure Container Apps
- Our H2 in-memory database would be replaced with AWS RDS or Azure SQL 
  in a real production environment

## Why It Matters
Almost every modern company deploys applications to the cloud instead of 
physical servers. Understanding basic cloud concepts is essential even for 
backend developers, since apps need to be deployed somewhere.