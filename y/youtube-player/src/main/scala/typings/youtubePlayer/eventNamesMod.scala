package typings.youtubePlayer

import org.scalablytyped.runtime.Shortcut
import typings.youtubePlayer.youtubePlayerStrings.apiChange
import typings.youtubePlayer.youtubePlayerStrings.error
import typings.youtubePlayer.youtubePlayerStrings.playbackQualityChange
import typings.youtubePlayer.youtubePlayerStrings.playbackRateChange
import typings.youtubePlayer.youtubePlayerStrings.ready
import typings.youtubePlayer.youtubePlayerStrings.stateChange
import typings.youtubePlayer.youtubePlayerStrings.volumeChange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventNamesMod extends Shortcut {
  
  @JSImport("youtube-player/dist/eventNames", JSImport.Default)
  @js.native
  val default: js.Tuple7[
    ready, 
    stateChange, 
    playbackQualityChange, 
    playbackRateChange, 
    error, 
    apiChange, 
    volumeChange
  ] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.youtubePlayer.youtubePlayerStrings.ready
    - typings.youtubePlayer.youtubePlayerStrings.stateChange
    - typings.youtubePlayer.youtubePlayerStrings.playbackQualityChange
    - typings.youtubePlayer.youtubePlayerStrings.playbackRateChange
    - typings.youtubePlayer.youtubePlayerStrings.error
    - typings.youtubePlayer.youtubePlayerStrings.apiChange
    - typings.youtubePlayer.youtubePlayerStrings.volumeChange
  */
  trait EventType extends StObject
  object EventType {
    
    inline def apiChange: typings.youtubePlayer.youtubePlayerStrings.apiChange = "apiChange".asInstanceOf[typings.youtubePlayer.youtubePlayerStrings.apiChange]
    
    inline def error: typings.youtubePlayer.youtubePlayerStrings.error = "error".asInstanceOf[typings.youtubePlayer.youtubePlayerStrings.error]
    
    inline def playbackQualityChange: typings.youtubePlayer.youtubePlayerStrings.playbackQualityChange = "playbackQualityChange".asInstanceOf[typings.youtubePlayer.youtubePlayerStrings.playbackQualityChange]
    
    inline def playbackRateChange: typings.youtubePlayer.youtubePlayerStrings.playbackRateChange = "playbackRateChange".asInstanceOf[typings.youtubePlayer.youtubePlayerStrings.playbackRateChange]
    
    inline def ready: typings.youtubePlayer.youtubePlayerStrings.ready = "ready".asInstanceOf[typings.youtubePlayer.youtubePlayerStrings.ready]
    
    inline def stateChange: typings.youtubePlayer.youtubePlayerStrings.stateChange = "stateChange".asInstanceOf[typings.youtubePlayer.youtubePlayerStrings.stateChange]
    
    inline def volumeChange: typings.youtubePlayer.youtubePlayerStrings.volumeChange = "volumeChange".asInstanceOf[typings.youtubePlayer.youtubePlayerStrings.volumeChange]
  }
  
  type _To = js.Tuple7[
    ready, 
    stateChange, 
    playbackQualityChange, 
    playbackRateChange, 
    error, 
    apiChange, 
    volumeChange
  ]
  
  /* This means you don't have to write `default`, but can instead just say `eventNamesMod.foo` */
  override def _to: js.Tuple7[
    ready, 
    stateChange, 
    playbackQualityChange, 
    playbackRateChange, 
    error, 
    apiChange, 
    volumeChange
  ] = default
}
