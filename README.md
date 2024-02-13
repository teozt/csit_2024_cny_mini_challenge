The mobile RE Challenge aims to cover SSL pinning. However, all the secrets are in the apk itself so copying out the decrypt function and the base64 strings and compiling a new java application will suffice without installing the app or using frida.

Alternative we can use cyberchef: 
Decrypt -- https://gchq.github.io/CyberChef/#recipe=From_Base64('A-Za-z0-9%2B/%3D',true,false)AES_Decrypt(%7B'option':'Hex','string':'dd%20dd%201f%20bb%2059%20e3%20cf%208f%2086%20cb%2075%20da%2033%2065%2093%203d%20cc%2095%205c%208d%20bd%2041%2052%20b2%20bc%2020%20aa%206f%2039%2020%2093%2078'%7D,%7B'option':'Hex','string':''%7D,'ECB','Raw','Raw',%7B'option':'Hex','string':''%7D,%7B'option':'Hex','string':''%7D)To_Hex('Space',0/disabled)&input=ZE5MRkdLLzk4QWZGVFhhUWlCNjhuNzlVMFF1OEVHSEZxV1J2MEQ0RW9kcz0



However, the last two buttons (based on the layout in activity_main.xml) usage are unknown.
