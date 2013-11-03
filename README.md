Ghost Project 
===
Milestones
---
0. Splash startup screen

1. Figure out how to display a google map
2. Figure out gps capabilities, coordinate storage

  Show a User: 
      
  a. Android file that shows location
       
  b. Updates it with center on the user
        c. Register coordinates for user

  Show a Ghost: 
    a. Android file that shows the fake entity's location
    b. Appears as user moves
    c. should be clear that ghosts are not users

3. Create Entity Java file that stores
  a. Coordinates
  b. Nearest entity

4. Simple sequence indicating you're near a ghost

5. Battle sequence
   (At first, you can always win)


Google Maps Setup
---
Go to the SDK Manager and get "Google Play services for Froyo" under Extras (the more recent one didn't work for me). In Eclipse, click File -> Import -> Android -> Existing Android Code into Workspace. Browse to YourAndroidSDKLocation/extras/google_play_services_froyo/libproject/google-play-services_lib, check "Copy projects into workspace," and click "Finish."
The references in the Ghost project should be fine after that.. however, getting this done was quite convoluted for me, so if there are any issues please contact me.