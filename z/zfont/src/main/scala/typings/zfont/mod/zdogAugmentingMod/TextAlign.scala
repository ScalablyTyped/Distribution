package typings.zfont.mod.zdogAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Horizontal text alignment (equivalent to the CSS `text-align` property).
  * @see {@link https://github.com/jaames/zfont#textalign Zfont API} (Text)
  * @see {@link https://github.com/jaames/zfont#textalign-1 Zfont API} (TextGroup)
  */
/* Rewritten from type alias, can be one of: 
  - typings.zfont.zfontStrings.left
  - typings.zfont.zfontStrings.center
  - typings.zfont.zfontStrings.right
*/
trait TextAlign extends js.Object

object TextAlign {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def center: typings.zfont.zfontStrings.center = this.cast("center")
  @scala.inline
  def left: typings.zfont.zfontStrings.left = this.cast("left")
  @scala.inline
  def right: typings.zfont.zfontStrings.right = this.cast("right")
}

