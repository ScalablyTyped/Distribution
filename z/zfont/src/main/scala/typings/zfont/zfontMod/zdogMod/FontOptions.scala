package typings.zfont.zfontMod.zdogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see {@link Font}
  * @see {@link https://github.com/jaames/zfont#options Zfont API}
  */
trait FontOptions extends js.Object {
  /** Font URL path. This can be a `.ttf` or `.otf` font, check out the {@link https://github.com/photopea/Typr.js Typr.js repo} for more details about font support. */
  val src: String
}

object FontOptions {
  @scala.inline
  def apply(src: String): FontOptions = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FontOptions]
  }
}

