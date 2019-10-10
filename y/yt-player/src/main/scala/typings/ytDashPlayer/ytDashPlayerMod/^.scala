package typings.ytDashPlayer.ytDashPlayerMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Simple, robust, blazing-fast YouTube Player API
  *
  * @see https://github.com/feross/yt-player
  */
@JSImport("yt-player", JSImport.Namespace)
@js.native
class ^ protected () extends YouTubePlayer {
  def this(element: String) = this()
  /**
    * Create a new YouTube player. The player will take the place of the HTML
    * element element. Alternatively, element can be a selector string, which
    * will be passed to document.querySelector().
    *
    * Examples: `#player`, `.youtube-player`, or a DOM node.
    *
    * Optionally, provide an options object opts to customize the player.
    */
  def this(element: HTMLElement) = this()
  def this(element: String, options: YouTubePlayerOptions) = this()
  def this(element: HTMLElement, options: YouTubePlayerOptions) = this()
}

