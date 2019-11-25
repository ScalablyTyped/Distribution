package typings.youtubeDashPlayer.distEventNamesMod

import org.scalablytyped.runtime.TopLevel
import typings.youtubeDashPlayer.youtubeDashPlayerStrings.apiChange
import typings.youtubeDashPlayer.youtubeDashPlayerStrings.error
import typings.youtubeDashPlayer.youtubeDashPlayerStrings.playbackQualityChange
import typings.youtubeDashPlayer.youtubeDashPlayerStrings.playbackRateChange
import typings.youtubeDashPlayer.youtubeDashPlayerStrings.ready
import typings.youtubeDashPlayer.youtubeDashPlayerStrings.stateChange
import typings.youtubeDashPlayer.youtubeDashPlayerStrings.volumeChange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("youtube-player/dist/eventNames", JSImport.Default)
@js.native
object default
  extends TopLevel[
      js.Tuple7[
        ready, 
        stateChange, 
        playbackQualityChange, 
        playbackRateChange, 
        error, 
        apiChange, 
        volumeChange
      ]
    ]

