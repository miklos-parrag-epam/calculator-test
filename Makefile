APP = calculator-test

# Docker
local-docker-build:
	docker build -t localhost/$(APP):dev .

local-docker-run:
	docker run -p 80:8080 --rm localhost/$(APP):dev

# GCloud-specific targets
gcloud-docker-init:
	gcloud auth configure-docker

gcloud-docker-build:
	docker build -t gcr.io/$(GCP_PROJECT_ID)/$(APP):$(ENVIRONMENT) .

gcloud-docker-push:
	docker push gcr.io/$(GCP_PROJECT_ID)/$(APP):$(ENVIRONMENT)

gcloud-run-deploy:
	gcloud run deploy $(APP)-$(ENVIRONMENT) \
	--region europe-west2 \
	--image gcr.io/$(GCP_PROJECT_ID)/$(APP):$(ENVIRONMENT) \
	--port 80 \
	--project $(GCP_PROJECT_ID) \
	--max-instances 1 \
	--platform managed \
	--labels environment=$(ENVIRONMENT) \
	--allow-unauthenticated
