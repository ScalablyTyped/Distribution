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

