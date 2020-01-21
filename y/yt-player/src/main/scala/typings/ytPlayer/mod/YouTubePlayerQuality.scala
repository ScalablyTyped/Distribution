package typings.ytPlayer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.ytPlayer.ytPlayerStrings.small
  - typings.ytPlayer.ytPlayerStrings.medium
  - typings.ytPlayer.ytPlayerStrings.large
  - typings.ytPlayer.ytPlayerStrings.hd720
  - typings.ytPlayer.ytPlayerStrings.hd1080
  - typings.ytPlayer.ytPlayerStrings.highres
  - typings.ytPlayer.ytPlayerStrings.default
*/
trait YouTubePlayerQuality extends js.Object

object YouTubePlayerQuality {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def default: typings.ytPlayer.ytPlayerStrings.default = this.cast("default")
  @scala.inline
  def hd1080: typings.ytPlayer.ytPlayerStrings.hd1080 = this.cast("hd1080")
  @scala.inline
  def hd720: typings.ytPlayer.ytPlayerStrings.hd720 = this.cast("hd720")
  @scala.inline
  def highres: typings.ytPlayer.ytPlayerStrings.highres = this.cast("highres")
  @scala.inline
  def large: typings.ytPlayer.ytPlayerStrings.large = this.cast("large")
  @scala.inline
  def medium: typings.ytPlayer.ytPlayerStrings.medium = this.cast("medium")
  @scala.inline
  def small: typings.ytPlayer.ytPlayerStrings.small = this.cast("small")
}

