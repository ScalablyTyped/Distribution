package typings.youtubePlayer

import typings.youtubePlayer.eventNamesMod.EventType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object youtubePlayerStrings {
  @js.native
  sealed trait apiChange extends EventType
  
  @js.native
  sealed trait error extends EventType
  
  @js.native
  sealed trait playbackQualityChange extends EventType
  
  @js.native
  sealed trait playbackRateChange extends EventType
  
  @js.native
  sealed trait playlist extends js.Object
  
  @js.native
  sealed trait ready extends EventType
  
  @js.native
  sealed trait red extends js.Object
  
  @js.native
  sealed trait search extends js.Object
  
  @js.native
  sealed trait stateChange extends EventType
  
  @js.native
  sealed trait user_uploads extends js.Object
  
  @js.native
  sealed trait volumeChange extends EventType
  
  @js.native
  sealed trait white extends js.Object
  
  @scala.inline
  def apiChange: apiChange = "apiChange".asInstanceOf[apiChange]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def playbackQualityChange: playbackQualityChange = "playbackQualityChange".asInstanceOf[playbackQualityChange]
  @scala.inline
  def playbackRateChange: playbackRateChange = "playbackRateChange".asInstanceOf[playbackRateChange]
  @scala.inline
  def playlist: playlist = "playlist".asInstanceOf[playlist]
  @scala.inline
  def ready: ready = "ready".asInstanceOf[ready]
  @scala.inline
  def red: red = "red".asInstanceOf[red]
  @scala.inline
  def search: search = "search".asInstanceOf[search]
  @scala.inline
  def stateChange: stateChange = "stateChange".asInstanceOf[stateChange]
  @scala.inline
  def user_uploads: user_uploads = "user_uploads".asInstanceOf[user_uploads]
  @scala.inline
  def volumeChange: volumeChange = "volumeChange".asInstanceOf[volumeChange]
  @scala.inline
  def white: white = "white".asInstanceOf[white]
}

