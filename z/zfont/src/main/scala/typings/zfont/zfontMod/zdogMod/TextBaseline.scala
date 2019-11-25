package typings.zfont.zfontMod.zdogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Vertical text alignment, equivalent to the HTML5 canvas' {@link CanvasRenderingContext2D.textBaseline textBaseline} property.
  * @see {@link https://github.com/jaames/zfont#textbaseline Zfont API} (Text)
  * @see {@link https://github.com/jaames/zfont#textbaseline-1 Zfont API} (TextGroup)
  */
/* Rewritten from type alias, can be one of: 
  - typings.zfont.zfontStrings.top
  - typings.zfont.zfontStrings.middle
  - typings.zfont.zfontStrings.bottom
*/
trait TextBaseline extends js.Object

object TextBaseline {
  @scala.inline
  def bottom: typings.zfont.zfontStrings.bottom = this.cast("bottom")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def middle: typings.zfont.zfontStrings.middle = this.cast("middle")
  @scala.inline
  def top: typings.zfont.zfontStrings.top = this.cast("top")
}

