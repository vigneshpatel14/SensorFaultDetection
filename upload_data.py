from pymongo import MongoClient
import pandas as pd
import json

#url

uri = "mongodb+srv://Vignesh:12345@cluster0.3eufg.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0"

#Create new client and connect to server
client = MongoClient(uri)


#Create a database name and collection name
DATABASE_NAME = "pwskills"
COLLECTION_NAME = "waferfault"

df = pd.read_csv("C:\Users\Vignesh\Downloads\Sensor_Project\notebooks\wafer_23012020_041211.csv")

df = df.drop("Unnamed: 0" , axis = 1)

json_record = list(json.loads(df.T.to_json()).values())

client[DATABASE_NAME][COLLECTION_NAME].insert_many(json_record)