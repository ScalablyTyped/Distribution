package typings.ytDashPlayer.ytDashPlayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.ytDashPlayer.ytDashPlayerStrings.small
  - typings.ytDashPlayer.ytDashPlayerStrings.medium
  - typings.ytDashPlayer.ytDashPlayerStrings.large
  - typings.ytDashPlayer.ytDashPlayerStrings.hd720
  - typings.ytDashPlayer.ytDashPlayerStrings.hd1080
  - typings.ytDashPlayer.ytDashPlayerStrings.highres
  - typings.ytDashPlayer.ytDashPlayerStrings.default
*/
trait YouTubePlayerQuality extends js.Object

object YouTubePlayerQuality {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def default: typings.ytDashPlayer.ytDashPlayerStrings.default = this.cast("default")
  @scala.inline
  def hd1080: typings.ytDashPlayer.ytDashPlayerStrings.hd1080 = this.cast("hd1080")
  @scala.inline
  def hd720: typings.ytDashPlayer.ytDashPlayerStrings.hd720 = this.cast("hd720")
  @scala.inline
  def highres: typings.ytDashPlayer.ytDashPlayerStrings.highres = this.cast("highres")
  @scala.inline
  def large: typings.ytDashPlayer.ytDashPlayerStrings.large = this.cast("large")
  @scala.inline
  def medium: typings.ytDashPlayer.ytDashPlayerStrings.medium = this.cast("medium")
  @scala.inline
  def small: typings.ytDashPlayer.ytDashPlayerStrings.small = this.cast("small")
}

