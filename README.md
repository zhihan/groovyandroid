A minimalist groovy skeleton for Android mobiel apps

Note on signing

  This app is configured to use a customized keystore in the root directory. You can create the keystore by

    keytool -geneky -keystore debug.keystore -alias zhihan -keyalg RSA

The other parameters are found in the build.gradle file.