package typings.yogaWasmWeb

import typings.yogaWasmWeb.distWrapAsmMod.Config
import typings.yogaWasmWeb.distWrapAsmMod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Create extends StObject {
    
    def create(): Config
    
    def destroy(config: Config): Any
  }
  object Create {
    
    inline def apply(create: () => Config, destroy: Config => Any): Create = {
      val __obj = js.Dynamic.literal(create = js.Any.fromFunction0(create), destroy = js.Any.fromFunction1(destroy))
      __obj.asInstanceOf[Create]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Create] (val x: Self) extends AnyVal {
      
      inline def setCreate(value: () => Config): Self = StObject.set(x, "create", js.Any.fromFunction0(value))
      
      inline def setDestroy(value: Config => Any): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
    }
  }
  
  trait CreateDefault extends StObject {
    
    def create(): Node
    
    def createDefault(): Node
    
    def createWithConfig(config: Config): Node
    
    def destroy(node: Node): Any
  }
  object CreateDefault {
    
    inline def apply(
      create: () => Node,
      createDefault: () => Node,
      createWithConfig: Config => Node,
      destroy: Node => Any
    ): CreateDefault = {
      val __obj = js.Dynamic.literal(create = js.Any.fromFunction0(create), createDefault = js.Any.fromFunction0(createDefault), createWithConfig = js.Any.fromFunction1(createWithConfig), destroy = js.Any.fromFunction1(destroy))
      __obj.asInstanceOf[CreateDefault]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CreateDefault] (val x: Self) extends AnyVal {
      
      inline def setCreate(value: () => Node): Self = StObject.set(x, "create", js.Any.fromFunction0(value))
      
      inline def setCreateDefault(value: () => Node): Self = StObject.set(x, "createDefault", js.Any.fromFunction0(value))
      
      inline def setCreateWithConfig(value: Config => Node): Self = StObject.set(x, "createWithConfig", js.Any.fromFunction1(value))
      
      inline def setDestroy(value: Node => Any): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
    }
  }
}
