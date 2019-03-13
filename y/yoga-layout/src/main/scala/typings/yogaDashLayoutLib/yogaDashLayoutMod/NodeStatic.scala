package typings
package yogaDashLayoutLib.yogaDashLayoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeStatic extends js.Object {
  def create(): yogaDashLayoutLib.yogaDashLayoutMod.YogaNs.YogaNode
  def createDefault(): yogaDashLayoutLib.yogaDashLayoutMod.YogaNs.YogaNode
  def createWithConfig(config: yogaDashLayoutLib.yogaDashLayoutMod.YogaNs.YogaConfig): yogaDashLayoutLib.yogaDashLayoutMod.YogaNs.YogaNode
  def destroy(node: yogaDashLayoutLib.yogaDashLayoutMod.YogaNs.YogaNode): js.Any
}

object NodeStatic {
  @scala.inline
  def apply(
    create: () => yogaDashLayoutLib.yogaDashLayoutMod.YogaNs.YogaNode,
    createDefault: () => yogaDashLayoutLib.yogaDashLayoutMod.YogaNs.YogaNode,
    createWithConfig: yogaDashLayoutLib.yogaDashLayoutMod.YogaNs.YogaConfig => yogaDashLayoutLib.yogaDashLayoutMod.YogaNs.YogaNode,
    destroy: yogaDashLayoutLib.yogaDashLayoutMod.YogaNs.YogaNode => js.Any
  ): NodeStatic = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction0(create), createDefault = js.Any.fromFunction0(createDefault), createWithConfig = js.Any.fromFunction1(createWithConfig), destroy = js.Any.fromFunction1(destroy))
  
    __obj.asInstanceOf[NodeStatic]
  }
}

