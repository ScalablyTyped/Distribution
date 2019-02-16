package typings
package youtubeDashPlayerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Emitter extends js.Object {
  def promisifyPlayer(playerAPIReady: js.Promise[youtubeDashPlayerLib.distTypesMod.YouTubePlayer]): youtubeDashPlayerLib.distTypesMod.YouTubePlayer = js.native
  def promisifyPlayer(
    playerAPIReady: js.Promise[youtubeDashPlayerLib.distTypesMod.YouTubePlayer],
    strictState: scala.Boolean
  ): youtubeDashPlayerLib.distTypesMod.YouTubePlayer = js.native
  def proxyEvents(emitter: youtubeDashPlayerLib.distTypesMod.EmitterType): youtubeDashPlayerLib.distYouTubePlayerMod.EventHandlerMapType = js.native
}

