package com.stonewall.swaudioplayerexample

import android.content.ContentResolver
import android.content.res.Resources
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.stonewall.swaudioplayer.SWAudioContract
import com.stonewall.swaudioplayer.SWAudioPlayer
import com.stonewall.swaudioplayerexample.ui.theme.SWAudioPlayerExampleTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val res: Resources = this.getResources()
        var uri = Uri.parse(ContentResolver.SCHEME_ANDROID_RESOURCE +
                "://" + res.getResourcePackageName(R.raw.a60f806cf0018da74c152efc61c98896d002bb10)
                + '/' + res.getResourceTypeName(R.raw.a60f806cf0018da74c152efc61c98896d002bb10)
                + '/' + res.getResourceEntryName(R.raw.a60f806cf0018da74c152efc61c98896d002bb10));

        var contract:SWAudioContract = SWAudioContract(
            uri
        )

        setContent {
            SWAudioPlayerExampleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    SWAudioPlayer(this, contract)
                }
            }
        }
    }
}