package typings.zfont.mod.zdogAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("zdog", "waitForFonts")
@js.native
object waitForFonts extends js.Object {
  
  /**
    * Returns a {@link Promise} which resolves as soon as all the fonts currently added to the scene are loaded and ready for use.
    * @see {@link https://github.com/jaames/zfont#zdogtext Zfont API}
    */
  def apply(): js.Promise[js.Array[js.UndefOr[scala.Nothing]]] = js.native
}
