package typings.zookeeper

import typings.std.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object zookeeperDeprecatedPromiseMod {
  
  /**
    * @extends Promise
    * @deprecated
    */
  @JSImport("zookeeperDeprecatedPromise", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with ZkPromise {
    def this(executor: js.Function2[
            /* resolve */ js.Function1[/* value */ js.UndefOr[Any], Unit], 
            /* reject */ js.Function1[/* reason */ js.UndefOr[Any], Unit], 
            Unit
          ]) = this()
  }
  
  /**
    * @extends Promise
    * @deprecated
    */
  @js.native
  trait ZkPromise
    extends StObject
       with Promise[Any] {
    
    /**
      * @deprecated
      */
    def addBoth(callback: Any): js.Promise[Any] = js.native
    
    /**
      * @deprecated
      */
    def addCallback(callback: Any): js.Promise[Any] = js.native
    
    /**
      * @deprecated
      */
    def addCallbacks(callback: Any, errback: Any): js.Promise[Any] = js.native
    
    /**
      * @deprecated
      */
    def addErrback(callback: Any): js.Promise[Any] = js.native
    
    /**
      * @deprecated
      */
    def call(functionName: Any, args: Any*): js.Promise[Any] = js.native
    
    /**
      * @deprecated
      */
    def get(propertyName: Any): js.Promise[Any] = js.native
    
    /**
      * @deprecated
      */
    def put(propertyName: Any, value: Any): js.Promise[Any] = js.native
  }
}
