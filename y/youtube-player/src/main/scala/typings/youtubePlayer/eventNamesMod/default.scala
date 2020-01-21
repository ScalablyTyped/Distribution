package typings.youtubePlayer.eventNamesMod

import org.scalablytyped.runtime.TopLevel
import typings.youtubePlayer.youtubePlayerStrings.apiChange
import typings.youtubePlayer.youtubePlayerStrings.error
import typings.youtubePlayer.youtubePlayerStrings.playbackQualityChange
import typings.youtubePlayer.youtubePlayerStrings.playbackRateChange
import typings.youtubePlayer.youtubePlayerStrings.ready
import typings.youtubePlayer.youtubePlayerStrings.stateChange
import typings.youtubePlayer.youtubePlayerStrings.volumeChange
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

