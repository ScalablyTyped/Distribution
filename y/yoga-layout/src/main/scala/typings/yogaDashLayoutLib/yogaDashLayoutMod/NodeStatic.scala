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
    create: () => YogaNode,
    createDefault: () => YogaNode,
    createWithConfig: YogaConfig => YogaNode,
    destroy: YogaNode => js.Any
  ): NodeStatic = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction0(create), createDefault = js.Any.fromFunction0(createDefault), createWithConfig = js.Any.fromFunction1(createWithConfig), destroy = js.Any.fromFunction1(destroy))
  
    __obj.asInstanceOf[NodeStatic]
  }
}

