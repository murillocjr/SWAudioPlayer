/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package com.stonewall.swaudioplayer

import android.content.Context
import android.media.MediaPlayer
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun SWAudioPlayer(context: Context, contract: SWAudioContract) {

    val mediaPlayer = MediaPlayer.create(context, contract.uri)

    Text(
        text = contract.uri.toString()
    )
    Button(
        onClick = {
            mediaPlayer.start()
        }
    ) {
        Text(text = "Play")
    }
}


