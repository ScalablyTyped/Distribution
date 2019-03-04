package typings
package yogaDashLayoutLib.yogaDashLayoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigStatic extends js.Object {
  def create(): YogaConfig
  def destroy(config: YogaConfig): js.Any
}

object ConfigStatic {
  @scala.inline
  def apply(create: js.Function0[YogaConfig], destroy: js.Function1[YogaConfig, js.Any]): ConfigStatic = {
    val __obj = js.Dynamic.literal(create = create, destroy = destroy)
  
    __obj.asInstanceOf[ConfigStatic]
  }
}

