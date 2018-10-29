# -*- coding: utf-8 -*-
"""
Created on Thu Aug 30 10:36:05 2018

@author: Prasad
"""
import os
import firebase_admin
from firebase_admin import messaging
from firebase_admin import credentials

import firebase_admin
from firebase_admin import credentials

if (not len(firebase_admin._apps)):
    cred = credentials.Certificate('./gcp.json') 
    default_app = firebase_admin.initialize_app(cred)

os.environ["GOOGLE_APPLICATION_CREDENTIALS"]= "F:\\projects\\gcp.json"
#default_app = firebase_admin.initialize_app()

# This registration token comes from the client FCM SDKs.
registration_token = "cQh-qk79boY:APA91bHp6SieC6Oc-E_bUJa0mqPg2X46Sgtmfvw2GPHGjgGZw9m18FSPb3LFcnnV1ZQzIjq-LVq-hohrbNOouODP9YpbcFshIehIj9iVgtU5aUeVrOaibGu5Xke4cagG6O4YdS7MNT1P"
# See documentation on defining a message payload.

message = messaging.Message(
    data={
        'score': '850',
        'time': '2:45',
    },
    token=registration_token,
)

# Send a message to the device corresponding to the provided
# registration token.
response = messaging.send(message)
# Response is a message ID string.
print('Successfully sent message:', response)