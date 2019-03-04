package typings
package yogaDashLayoutLib.yogaDashLayoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeStatic extends js.Object {
  def create(): YogaNode
  def createDefault(): YogaNode
  def createWithConfig(config: YogaConfig): YogaNode
  def destroy(node: YogaNode): js.Any
}

object NodeStatic {
  @scala.inline
  def apply(
    create: js.Function0[YogaNode],
    createDefault: js.Function0[YogaNode],
    createWithConfig: js.Function1[YogaConfig, YogaNode],
    destroy: js.Function1[YogaNode, js.Any]
  ): NodeStatic = {
    val __obj = js.Dynamic.literal(create = create, createDefault = createDefault, createWithConfig = createWithConfig, destroy = destroy)
  
    __obj.asInstanceOf[NodeStatic]
  }
}

