#!/usr/bin/env python

import os, sys
query = sys.argv[1]
access_token = sys.argv[2]
last = "curl -X \"GET\" \"https://api.spotify.com/v1/search?q="+query+"&type=playlist\" -H \"Accept: application/json\" -H \"Content-Type: application/json\" -H \"Authorization: Bearer "+ access_token + "\""
getList=os.system(last)
