package typings
package youtubeLib.YTNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PlayerState extends js.Object

@JSGlobal("YT.PlayerState")
@js.native
object PlayerState extends js.Object {
  @js.native
  sealed trait BUFFERING
    extends youtubeLib.YTNs.PlayerState
  
  @js.native
  sealed trait CUED
    extends youtubeLib.YTNs.PlayerState
  
  @js.native
  sealed trait ENDED
    extends youtubeLib.YTNs.PlayerState
  
  @js.native
  sealed trait PAUSED
    extends youtubeLib.YTNs.PlayerState
  
  @js.native
  sealed trait PLAYING
    extends youtubeLib.YTNs.PlayerState
  
  @js.native
  sealed trait UNSTARTED
    extends youtubeLib.YTNs.PlayerState
  
  /* 3 */ val BUFFERING: BUFFERING with scala.Double = js.native
  /* 5 */ val CUED: CUED with scala.Double = js.native
  /* 0 */ val ENDED: ENDED with scala.Double = js.native
  /* 2 */ val PAUSED: PAUSED with scala.Double = js.native
  /* 1 */ val PLAYING: PLAYING with scala.Double = js.native
  /* -1 */ val UNSTARTED: UNSTARTED with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[youtubeLib.YTNs.PlayerState with scala.Double] = js.native
}

