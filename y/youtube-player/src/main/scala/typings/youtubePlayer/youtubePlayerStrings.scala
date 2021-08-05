package typings.youtubePlayer

import typings.youtubePlayer.eventNamesMod.EventType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object youtubePlayerStrings {
  
  @js.native
  sealed trait apiChange
    extends StObject
       with EventType
  inline def apiChange: apiChange = "apiChange".asInstanceOf[apiChange]
  
  @js.native
  sealed trait error
    extends StObject
       with EventType
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait playbackQualityChange
    extends StObject
       with EventType
  inline def playbackQualityChange: playbackQualityChange = "playbackQualityChange".asInstanceOf[playbackQualityChange]
  
  @js.native
  sealed trait playbackRateChange
    extends StObject
       with EventType
  inline def playbackRateChange: playbackRateChange = "playbackRateChange".asInstanceOf[playbackRateChange]
  
  @js.native
  sealed trait playlist extends StObject
  inline def playlist: playlist = "playlist".asInstanceOf[playlist]
  
  @js.native
  sealed trait ready
    extends StObject
       with EventType
  inline def ready: ready = "ready".asInstanceOf[ready]
  
  @js.native
  sealed trait red extends StObject
  inline def red: red = "red".asInstanceOf[red]
  
  @js.native
  sealed trait search extends StObject
  inline def search: search = "search".asInstanceOf[search]
  
  @js.native
  sealed trait stateChange
    extends StObject
       with EventType
  inline def stateChange: stateChange = "stateChange".asInstanceOf[stateChange]
  
  @js.native
  sealed trait user_uploads extends StObject
  inline def user_uploads: user_uploads = "user_uploads".asInstanceOf[user_uploads]
  
  @js.native
  sealed trait volumeChange
    extends StObject
       with EventType
  inline def volumeChange: volumeChange = "volumeChange".asInstanceOf[volumeChange]
  
  @js.native
  sealed trait white extends StObject
  inline def white: white = "white".asInstanceOf[white]
}
