curl -X POST -H "Content-Type: application/json" -d '{
  "messaging_type": "<UPDATE>",    \\ Message is being sent proactively and is not in response to a 
      \\received message. This includes promotional and non-promotional messages sent inside 
      \\the 24-hour standard messaging window or under the 24+1 policy
  
   "recipient": {
    "id": "<PSID>"
  },
  "message": {
    "text": "i am mad"
  }
}' "https://graph.facebook.com/v3.2/me/messages?access_token=<EXPRESSION>"
