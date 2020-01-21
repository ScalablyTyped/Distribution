package typings.youtubePlayer

import typings.std.HTMLElement
import typings.youtubePlayer.typesMod.Options
import typings.youtubePlayer.typesMod.YouTubePlayer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("youtube-player/dist", JSImport.Namespace)
@js.native
object distMod extends js.Object {
  def default(maybeElementId: String): YouTubePlayer = js.native
  def default(maybeElementId: String, options: Options): YouTubePlayer = js.native
  def default(maybeElementId: String, options: Options, strictState: Boolean): YouTubePlayer = js.native
  def default(maybeElementId: HTMLElement): YouTubePlayer = js.native
  def default(maybeElementId: HTMLElement, options: Options): YouTubePlayer = js.native
  def default(maybeElementId: HTMLElement, options: Options, strictState: Boolean): YouTubePlayer = js.native
  def default(maybeElementId: YouTubePlayer): YouTubePlayer = js.native
  def default(maybeElementId: YouTubePlayer, options: Options): YouTubePlayer = js.native
  def default(maybeElementId: YouTubePlayer, options: Options, strictState: Boolean): YouTubePlayer = js.native
}

