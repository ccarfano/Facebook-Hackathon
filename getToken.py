#!/usr/bin/env python

import os

gettoken = "curl -X \"POST\" -H \"Authorization: Basic MjVkYjBmNWY2M2UwNDQ2ZmExNmI4OWFiNjA0YmIxNWI6MzZmYTZhNjM1OGM0NGQxZTlmNTNlMzA4N2U0NzUwYTU=\" -d grant_type=client_credentials https://accounts.spotify.com/api/token"

token = os.system(gettoken)

print(token)
