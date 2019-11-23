package typings.zfont.zfontMod.zdogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a font that can be used by an instance of either {@link Text} or {@link TextGroup}.
  * @see {@link https://github.com/jaames/zfont#zdogfont Zfont API}
  */
@JSImport("zdog", "Font")
@js.native
class Font protected () extends js.Object {
  def this(options: FontOptions) = this()
  /**
    * Returns a Promise which resolves once this font has finished loading.
    * @see {@link https://github.com/jaames/zfont#waitforload Zfont API}
    */
  def waitForLoad(): js.Promise[Unit] = js.native
}

