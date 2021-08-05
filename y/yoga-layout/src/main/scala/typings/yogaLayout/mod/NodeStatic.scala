package typings.yogaLayout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeStatic extends StObject {
  
  def create(): YogaNode
  
  def createDefault(): YogaNode
  
  def createWithConfig(config: YogaConfig): YogaNode
  
  def destroy(node: YogaNode): js.Any
}
object NodeStatic {
  
  inline def apply(
    create: () => YogaNode,
    createDefault: () => YogaNode,
    createWithConfig: YogaConfig => YogaNode,
    destroy: YogaNode => js.Any
  ): NodeStatic = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction0(create), createDefault = js.Any.fromFunction0(createDefault), createWithConfig = js.Any.fromFunction1(createWithConfig), destroy = js.Any.fromFunction1(destroy))
    __obj.asInstanceOf[NodeStatic]
  }
  
  extension [Self <: NodeStatic](x: Self) {
    
    inline def setCreate(value: () => YogaNode): Self = StObject.set(x, "create", js.Any.fromFunction0(value))
    
    inline def setCreateDefault(value: () => YogaNode): Self = StObject.set(x, "createDefault", js.Any.fromFunction0(value))
    
    inline def setCreateWithConfig(value: YogaConfig => YogaNode): Self = StObject.set(x, "createWithConfig", js.Any.fromFunction1(value))
    
    inline def setDestroy(value: YogaNode => js.Any): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
  }
}
