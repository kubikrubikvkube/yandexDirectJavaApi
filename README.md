# yandexDirectJavaApi
Java library to interact with Yandex Direct API
If you want to get all your campaigns:

Create a selection criteria:

**CampaignsSelectionCriteria campaignsSelectionCriteria = new CampaignsSelectionCriteria();**
**campaignsSelectionCriteria.add(CampaignTypeGetEnum.TEXT_CAMPAIGN);**
        
Create a field list, which you want to get

**List<CampaignFieldEnum> fieldEnum = new ArrayList<>(1);**
**fieldEnum.add(CampaignFieldEnum.Id);**

Then get your JSON get request:
**GetRequest getRequest = new GetRequest(campaignsSelectionCriteria, fieldEnum);**

*{"SelectionCriteria":{"Types":["TEXT_CAMPAIGN"]},"FieldNames":["Id"]}*

It's a good way to communicate with Yandex Direct API from Java environment - all objects (like Campaigns and Ads) are ready to be serialized and stored to ORM, like Hibernate.




