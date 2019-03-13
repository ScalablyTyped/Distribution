package typings
package yogaDashLayoutLib.yogaDashLayoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigStatic extends js.Object {
  def create(): yogaDashLayoutLib.yogaDashLayoutMod.YogaNs.YogaConfig
  def destroy(config: yogaDashLayoutLib.yogaDashLayoutMod.YogaNs.YogaConfig): js.Any
}

object ConfigStatic {
  @scala.inline
  def apply(
    create: () => yogaDashLayoutLib.yogaDashLayoutMod.YogaNs.YogaConfig,
    destroy: yogaDashLayoutLib.yogaDashLayoutMod.YogaNs.YogaConfig => js.Any
  ): ConfigStatic = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction0(create), destroy = js.Any.fromFunction1(destroy))
  
    __obj.asInstanceOf[ConfigStatic]
  }
}

