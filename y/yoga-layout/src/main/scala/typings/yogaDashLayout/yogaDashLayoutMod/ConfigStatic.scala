package typings.yogaDashLayout.yogaDashLayoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigStatic extends js.Object {
  def create(): YogaConfig
  def destroy(config: YogaConfig): js.Any
}

object ConfigStatic {
  @scala.inline
  def apply(create: () => YogaConfig, destroy: YogaConfig => js.Any): ConfigStatic = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction0(create), destroy = js.Any.fromFunction1(destroy))
  
    __obj.asInstanceOf[ConfigStatic]
  }
}

