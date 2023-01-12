package typings.zustand.anon

import typings.zustand.zustandStrings.custom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dispatch extends StObject {
  
  var dispatch: js.UndefOr[Boolean] = js.undefined
  
  var `export`: js.UndefOr[Boolean | custom] = js.undefined
  
  var `import`: js.UndefOr[Boolean | custom] = js.undefined
  
  var jump: js.UndefOr[Boolean] = js.undefined
  
  var lock: js.UndefOr[Boolean] = js.undefined
  
  var pause: js.UndefOr[Boolean] = js.undefined
  
  var persist: js.UndefOr[Boolean] = js.undefined
  
  var reorder: js.UndefOr[Boolean] = js.undefined
  
  var skip: js.UndefOr[Boolean] = js.undefined
  
  var test: js.UndefOr[Boolean] = js.undefined
}
object Dispatch {
  
  inline def apply(): Dispatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dispatch]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Dispatch] (val x: Self) extends AnyVal {
    
    inline def setDispatch(value: Boolean): Self = StObject.set(x, "dispatch", value.asInstanceOf[js.Any])
    
    inline def setDispatchUndefined: Self = StObject.set(x, "dispatch", js.undefined)
    
    inline def setExport(value: Boolean | custom): Self = StObject.set(x, "export", value.asInstanceOf[js.Any])
    
    inline def setExportUndefined: Self = StObject.set(x, "export", js.undefined)
    
    inline def setImport(value: Boolean | custom): Self = StObject.set(x, "import", value.asInstanceOf[js.Any])
    
    inline def setImportUndefined: Self = StObject.set(x, "import", js.undefined)
    
    inline def setJump(value: Boolean): Self = StObject.set(x, "jump", value.asInstanceOf[js.Any])
    
    inline def setJumpUndefined: Self = StObject.set(x, "jump", js.undefined)
    
    inline def setLock(value: Boolean): Self = StObject.set(x, "lock", value.asInstanceOf[js.Any])
    
    inline def setLockUndefined: Self = StObject.set(x, "lock", js.undefined)
    
    inline def setPause(value: Boolean): Self = StObject.set(x, "pause", value.asInstanceOf[js.Any])
    
    inline def setPauseUndefined: Self = StObject.set(x, "pause", js.undefined)
    
    inline def setPersist(value: Boolean): Self = StObject.set(x, "persist", value.asInstanceOf[js.Any])
    
    inline def setPersistUndefined: Self = StObject.set(x, "persist", js.undefined)
    
    inline def setReorder(value: Boolean): Self = StObject.set(x, "reorder", value.asInstanceOf[js.Any])
    
    inline def setReorderUndefined: Self = StObject.set(x, "reorder", js.undefined)
    
    inline def setSkip(value: Boolean): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
    
    inline def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
    
    inline def setTest(value: Boolean): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    
    inline def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
  }
}
