package typings.youtubeDashPlayer

import typings.std.HTMLElement
import typings.youtubeDashPlayer.distTypesMod.Options
import typings.youtubeDashPlayer.distTypesMod.YouTubePlayer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("youtube-player", JSImport.Namespace)
@js.native
object youtubeDashPlayerMod extends js.Object {
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

