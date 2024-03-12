## SSO with google and springboot 3.2.3 

***Error:***
Exceeded maxRedirects. Probably stuck in a redirect loop http://localhost:9191/   

***sol:***
so i made a mistake like hear i given /login means custom login page i'm giving instrad of default so it is cofusing like which url it should go in my requirement i want to go with default so simple i changed the code from:
```
.oauth2Login(oauth2 -> oauth2.loginpage(/login);
```
		to
  ```
.oauth2Login(oauth2 -> {});
```
