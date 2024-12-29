# Android text field test

This tiny app reproduces what seems to be a TalkBack bug with text fields (edit boxes).

[Download a prebuilt APK.](curl -I https://mwcampbell.us/android/text-field-test.apk)

Steps to reproduce:

1. First, make sure TalkBack is set to move by character when you swipe up and down.
2. Start the app.
3. Double-tap to start editing in the edit box.
4. Swipe down to start moving forward by character through the text. Keep going until you get to the "k" at the end.

Expected behavior: The cursor should move through the text. When you get to the "k" at the end, TalkBack should say "end of field". Inserting or deleting text should take effect at the new cursor location.

Observed behavior: The cursor stays at the beginning of the text. So any text you insert after supposedly moving the cursor will be inserted at the beginning of the text. Or, if you're trying to delete text, you can't, because the cursor is still at the beginning. The problem seems to go away as soon as you insert any text.
