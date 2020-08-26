package typings.yogaLayout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeStatic extends js.Object {
  def create(): YogaNode = js.native
  def createDefault(): YogaNode = js.native
  def createWithConfig(config: YogaConfig): YogaNode = js.native
  def destroy(node: YogaNode): js.Any = js.native
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
  @scala.inline
  implicit class NodeStaticOps[Self <: NodeStatic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreate(value: () => YogaNode): Self = this.set("create", js.Any.fromFunction0(value))
    @scala.inline
    def setCreateDefault(value: () => YogaNode): Self = this.set("createDefault", js.Any.fromFunction0(value))
    @scala.inline
    def setCreateWithConfig(value: YogaConfig => YogaNode): Self = this.set("createWithConfig", js.Any.fromFunction1(value))
    @scala.inline
    def setDestroy(value: YogaNode => js.Any): Self = this.set("destroy", js.Any.fromFunction1(value))
  }
  
}

