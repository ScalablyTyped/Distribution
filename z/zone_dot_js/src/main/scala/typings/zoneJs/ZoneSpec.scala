package typings.zoneJs

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides a way to configure the interception of zone events.
  *
  * Only the `name` property is required (all other are optional).
  */
@js.native
trait ZoneSpec extends StObject {
  
  /**
    * The name of the zone. Useful when debugging Zones.
    */
  var name: String = js.native
  
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
      _
    ]
  ] = js.native
  
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
  ] = js.native
  
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
      /* error */ js.Any, 
      Boolean
    ]
  ] = js.native
  
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
  ] = js.native
  
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
  ] = js.native
  
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
      /* applyThis */ js.Any, 
      /* applyArgs */ js.UndefOr[js.Array[_]], 
      /* source */ js.UndefOr[String], 
      _
    ]
  ] = js.native
  
  var onInvokeTask: js.UndefOr[
    js.Function6[
      /* parentZoneDelegate */ ZoneDelegate, 
      /* currentZone */ Zone, 
      /* targetZone */ Zone, 
      /* task */ Task, 
      /* applyThis */ js.Any, 
      /* applyArgs */ js.UndefOr[js.Array[_]], 
      _
    ]
  ] = js.native
  
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
  ] = js.native
  
  /**
    * A set of properties to be associated with Zone. Use [Zone.get] to retrieve them.
    */
  var properties: js.UndefOr[StringDictionary[js.Any]] = js.native
}
object ZoneSpec {
  
  @scala.inline
  def apply(name: String): ZoneSpec = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZoneSpec]
  }
  
  @scala.inline
  implicit class ZoneSpecMutableBuilder[Self <: ZoneSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnCancelTask(
      value: (/* parentZoneDelegate */ ZoneDelegate, /* currentZone */ Zone, /* targetZone */ Zone, /* task */ Task) => _
    ): Self = StObject.set(x, "onCancelTask", js.Any.fromFunction4(value))
    
    @scala.inline
    def setOnCancelTaskUndefined: Self = StObject.set(x, "onCancelTask", js.undefined)
    
    @scala.inline
    def setOnFork(
      value: (/* parentZoneDelegate */ ZoneDelegate, /* currentZone */ Zone, /* targetZone */ Zone, ZoneSpec) => Zone
    ): Self = StObject.set(x, "onFork", js.Any.fromFunction4(value))
    
    @scala.inline
    def setOnForkUndefined: Self = StObject.set(x, "onFork", js.undefined)
    
    @scala.inline
    def setOnHandleError(
      value: (/* parentZoneDelegate */ ZoneDelegate, /* currentZone */ Zone, /* targetZone */ Zone, /* error */ js.Any) => Boolean
    ): Self = StObject.set(x, "onHandleError", js.Any.fromFunction4(value))
    
    @scala.inline
    def setOnHandleErrorUndefined: Self = StObject.set(x, "onHandleError", js.undefined)
    
    @scala.inline
    def setOnHasTask(
      value: (/* parentZoneDelegate */ ZoneDelegate, /* currentZone */ Zone, /* targetZone */ Zone, /* hasTaskState */ HasTaskState) => Unit
    ): Self = StObject.set(x, "onHasTask", js.Any.fromFunction4(value))
    
    @scala.inline
    def setOnHasTaskUndefined: Self = StObject.set(x, "onHasTask", js.undefined)
    
    @scala.inline
    def setOnIntercept(
      value: (/* parentZoneDelegate */ ZoneDelegate, /* currentZone */ Zone, /* targetZone */ Zone, /* delegate */ js.Function, /* source */ String) => js.Function
    ): Self = StObject.set(x, "onIntercept", js.Any.fromFunction5(value))
    
    @scala.inline
    def setOnInterceptUndefined: Self = StObject.set(x, "onIntercept", js.undefined)
    
    @scala.inline
    def setOnInvoke(
      value: (/* parentZoneDelegate */ ZoneDelegate, /* currentZone */ Zone, /* targetZone */ Zone, /* delegate */ js.Function, /* applyThis */ js.Any, /* applyArgs */ js.UndefOr[js.Array[_]], /* source */ js.UndefOr[String]) => _
    ): Self = StObject.set(x, "onInvoke", js.Any.fromFunction7(value))
    
    @scala.inline
    def setOnInvokeTask(
      value: (/* parentZoneDelegate */ ZoneDelegate, /* currentZone */ Zone, /* targetZone */ Zone, /* task */ Task, /* applyThis */ js.Any, /* applyArgs */ js.UndefOr[js.Array[_]]) => _
    ): Self = StObject.set(x, "onInvokeTask", js.Any.fromFunction6(value))
    
    @scala.inline
    def setOnInvokeTaskUndefined: Self = StObject.set(x, "onInvokeTask", js.undefined)
    
    @scala.inline
    def setOnInvokeUndefined: Self = StObject.set(x, "onInvoke", js.undefined)
    
    @scala.inline
    def setOnScheduleTask(
      value: (/* parentZoneDelegate */ ZoneDelegate, /* currentZone */ Zone, /* targetZone */ Zone, /* task */ Task) => Task
    ): Self = StObject.set(x, "onScheduleTask", js.Any.fromFunction4(value))
    
    @scala.inline
    def setOnScheduleTaskUndefined: Self = StObject.set(x, "onScheduleTask", js.undefined)
    
    @scala.inline
    def setProperties(value: StringDictionary[js.Any]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
  }
}
