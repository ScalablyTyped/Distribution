package typings.zoneJs

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides a way to configure the interception of zone events.
  *
  * Only the `name` property is required (all other are optional).
  */
trait ZoneSpec extends StObject {
  
  /**
    * The name of the zone. Useful when debugging Zones.
    */
  var name: String
  
  /**
    * Allows interception of task cancellation.
    *
    * @param parentZoneDelegate Delegate which performs the parent [ZoneSpec] operation.
    * @param currentZone The current [Zone] where the current interceptor has been declared.
    * @param targetZone The [Zone] which originally received the request.
    * @param task The argument passed into the `cancelTask` method.
    */
  var onCancelTask: js.UndefOr[
    js.Function4[
      /* parentZoneDelegate */ ZoneDelegate, 
      /* currentZone */ Zone, 
      /* targetZone */ Zone, 
      /* task */ Task, 
      Any
    ]
  ] = js.undefined
  
  /**
    * Allows the interception of zone forking.
    *
    * When the zone is being forked, the request is forwarded to this method for interception.
    *
    * @param parentZoneDelegate Delegate which performs the parent [ZoneSpec] operation.
    * @param currentZone The current [Zone] where the current interceptor has been declared.
    * @param targetZone The [Zone] which originally received the request.
    * @param zoneSpec The argument passed into the `fork` method.
    */
  var onFork: js.UndefOr[
    js.Function4[
      /* parentZoneDelegate */ ZoneDelegate, 
      /* currentZone */ Zone, 
      /* targetZone */ Zone, 
      /* zoneSpec */ this.type, 
      Zone
    ]
  ] = js.undefined
  
  /**
    * Allows interception of the error handling.
    *
    * @param parentZoneDelegate Delegate which performs the parent [ZoneSpec] operation.
    * @param currentZone The current [Zone] where the current interceptor has been declared.
    * @param targetZone The [Zone] which originally received the request.
    * @param error The argument passed into the `handleError` method.
    */
  var onHandleError: js.UndefOr[
    js.Function4[
      /* parentZoneDelegate */ ZoneDelegate, 
      /* currentZone */ Zone, 
      /* targetZone */ Zone, 
      /* error */ Any, 
      Boolean
    ]
  ] = js.undefined
  
  /**
    * Notifies of changes to the task queue empty status.
    *
    * @param parentZoneDelegate Delegate which performs the parent [ZoneSpec] operation.
    * @param currentZone The current [Zone] where the current interceptor has been declared.
    * @param targetZone The [Zone] which originally received the request.
    * @param hasTaskState
    */
  var onHasTask: js.UndefOr[
    js.Function4[
      /* parentZoneDelegate */ ZoneDelegate, 
      /* currentZone */ Zone, 
      /* targetZone */ Zone, 
      /* hasTaskState */ HasTaskState, 
      Unit
    ]
  ] = js.undefined
  
  /**
    * Allows interception of the wrapping of the callback.
    *
    * @param parentZoneDelegate Delegate which performs the parent [ZoneSpec] operation.
    * @param currentZone The current [Zone] where the current interceptor has been declared.
    * @param targetZone The [Zone] which originally received the request.
    * @param delegate The argument passed into the `wrap` method.
    * @param source The argument passed into the `wrap` method.
    */
  var onIntercept: js.UndefOr[
    js.Function5[
      /* parentZoneDelegate */ ZoneDelegate, 
      /* currentZone */ Zone, 
      /* targetZone */ Zone, 
      /* delegate */ js.Function, 
      /* source */ String, 
      js.Function
    ]
  ] = js.undefined
  
  /**
    * Allows interception of the callback invocation.
    *
    * @param parentZoneDelegate Delegate which performs the parent [ZoneSpec] operation.
    * @param currentZone The current [Zone] where the current interceptor has been declared.
    * @param targetZone The [Zone] which originally received the request.
    * @param delegate The argument passed into the `run` method.
    * @param applyThis The argument passed into the `run` method.
    * @param applyArgs The argument passed into the `run` method.
    * @param source The argument passed into the `run` method.
    */
  var onInvoke: js.UndefOr[
    js.Function7[
      /* parentZoneDelegate */ ZoneDelegate, 
      /* currentZone */ Zone, 
      /* targetZone */ Zone, 
      /* delegate */ js.Function, 
      /* applyThis */ Any, 
      /* applyArgs */ js.UndefOr[js.Array[Any]], 
      /* source */ js.UndefOr[String], 
      Any
    ]
  ] = js.undefined
  
  var onInvokeTask: js.UndefOr[
    js.Function6[
      /* parentZoneDelegate */ ZoneDelegate, 
      /* currentZone */ Zone, 
      /* targetZone */ Zone, 
      /* task */ Task, 
      /* applyThis */ Any, 
      /* applyArgs */ js.UndefOr[js.Array[Any]], 
      Any
    ]
  ] = js.undefined
  
  /**
    * Allows interception of task scheduling.
    *
    * @param parentZoneDelegate Delegate which performs the parent [ZoneSpec] operation.
    * @param currentZone The current [Zone] where the current interceptor has been declared.
    * @param targetZone The [Zone] which originally received the request.
    * @param task The argument passed into the `scheduleTask` method.
    */
  var onScheduleTask: js.UndefOr[
    js.Function4[
      /* parentZoneDelegate */ ZoneDelegate, 
      /* currentZone */ Zone, 
      /* targetZone */ Zone, 
      /* task */ Task, 
      Task
    ]
  ] = js.undefined
  
  /**
    * A set of properties to be associated with Zone. Use [Zone.get] to retrieve them.
    */
  var properties: js.UndefOr[StringDictionary[Any]] = js.undefined
}
object ZoneSpec {
  
  inline def apply(name: String): ZoneSpec = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZoneSpec]
  }
  
  extension [Self <: ZoneSpec](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOnCancelTask(
      value: (/* parentZoneDelegate */ ZoneDelegate, /* currentZone */ Zone, /* targetZone */ Zone, /* task */ Task) => Any
    ): Self = StObject.set(x, "onCancelTask", js.Any.fromFunction4(value))
    
    inline def setOnCancelTaskUndefined: Self = StObject.set(x, "onCancelTask", js.undefined)
    
    inline def setOnFork(
      value: (/* parentZoneDelegate */ ZoneDelegate, /* currentZone */ Zone, /* targetZone */ Zone, ZoneSpec) => Zone
    ): Self = StObject.set(x, "onFork", js.Any.fromFunction4(value))
    
    inline def setOnForkUndefined: Self = StObject.set(x, "onFork", js.undefined)
    
    inline def setOnHandleError(
      value: (/* parentZoneDelegate */ ZoneDelegate, /* currentZone */ Zone, /* targetZone */ Zone, /* error */ Any) => Boolean
    ): Self = StObject.set(x, "onHandleError", js.Any.fromFunction4(value))
    
    inline def setOnHandleErrorUndefined: Self = StObject.set(x, "onHandleError", js.undefined)
    
    inline def setOnHasTask(
      value: (/* parentZoneDelegate */ ZoneDelegate, /* currentZone */ Zone, /* targetZone */ Zone, /* hasTaskState */ HasTaskState) => Unit
    ): Self = StObject.set(x, "onHasTask", js.Any.fromFunction4(value))
    
    inline def setOnHasTaskUndefined: Self = StObject.set(x, "onHasTask", js.undefined)
    
    inline def setOnIntercept(
      value: (/* parentZoneDelegate */ ZoneDelegate, /* currentZone */ Zone, /* targetZone */ Zone, /* delegate */ js.Function, /* source */ String) => js.Function
    ): Self = StObject.set(x, "onIntercept", js.Any.fromFunction5(value))
    
    inline def setOnInterceptUndefined: Self = StObject.set(x, "onIntercept", js.undefined)
    
    inline def setOnInvoke(
      value: (/* parentZoneDelegate */ ZoneDelegate, /* currentZone */ Zone, /* targetZone */ Zone, /* delegate */ js.Function, /* applyThis */ Any, /* applyArgs */ js.UndefOr[js.Array[Any]], /* source */ js.UndefOr[String]) => Any
    ): Self = StObject.set(x, "onInvoke", js.Any.fromFunction7(value))
    
    inline def setOnInvokeTask(
      value: (/* parentZoneDelegate */ ZoneDelegate, /* currentZone */ Zone, /* targetZone */ Zone, /* task */ Task, /* applyThis */ Any, /* applyArgs */ js.UndefOr[js.Array[Any]]) => Any
    ): Self = StObject.set(x, "onInvokeTask", js.Any.fromFunction6(value))
    
    inline def setOnInvokeTaskUndefined: Self = StObject.set(x, "onInvokeTask", js.undefined)
    
    inline def setOnInvokeUndefined: Self = StObject.set(x, "onInvoke", js.undefined)
    
    inline def setOnScheduleTask(
      value: (/* parentZoneDelegate */ ZoneDelegate, /* currentZone */ Zone, /* targetZone */ Zone, /* task */ Task) => Task
    ): Self = StObject.set(x, "onScheduleTask", js.Any.fromFunction4(value))
    
    inline def setOnScheduleTaskUndefined: Self = StObject.set(x, "onScheduleTask", js.undefined)
    
    inline def setProperties(value: StringDictionary[Any]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
  }
}
