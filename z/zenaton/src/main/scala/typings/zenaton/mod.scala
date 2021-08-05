package typings.zenaton

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("zenaton", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("zenaton", "Client")
  @js.native
  class Client protected () extends StObject {
    def this(args: js.Any*) = this()
    
    def findWorkflow(args: js.Any*): js.Any = js.native
    
    def getAppEnv(args: js.Any*): js.Any = js.native
    
    def getBodyForTask(args: js.Any*): js.Any = js.native
    
    def getBodyForWorkflow(args: js.Any*): js.Any = js.native
    
    def getWebsiteUrl(args: js.Any*): js.Any = js.native
    
    def getWorkerUrl(args: js.Any*): js.Any = js.native
    
    def getWorkerUrlNew(args: js.Any*): js.Any = js.native
    
    def killWorkflow(args: js.Any*): js.Any = js.native
    
    def mustBeScheduled(args: js.Any*): js.Any = js.native
    
    def pauseWorkflow(args: js.Any*): js.Any = js.native
    
    def resumeWorkflow(args: js.Any*): js.Any = js.native
    
    def sendEvent(args: js.Any*): js.Any = js.native
    
    def sendEventByInstanceId(args: js.Any*): js.Any = js.native
    
    def startInstantTask(args: js.Any*): js.Any = js.native
    
    def startInstantWorkflow(args: js.Any*): js.Any = js.native
    
    def startScheduledTask(args: js.Any*): js.Any = js.native
    
    def startScheduledWorkflow(args: js.Any*): js.Any = js.native
    
    def startTask(args: js.Any*): js.Any = js.native
    
    def startWorkflow(args: js.Any*): js.Any = js.native
    
    def updateInstance(args: js.Any*): js.Any = js.native
  }
  /* static members */
  object Client {
    
    @JSImport("zenaton", "Client")
    @js.native
    val ^ : js.Any = js.native
    
    inline def init(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  }
  
  @JSImport("zenaton", "Engine")
  @js.native
  class Engine protected () extends StObject {
    def this(args: js.Any*) = this()
    
    def checkArguments(args: js.Any*): js.Any = js.native
    
    def dispatch(args: js.Any*): js.Any = js.native
    
    def execute(args: js.Any*): js.Any = js.native
    
    def getInstanceId(args: js.Any*): js.Any = js.native
    
    def isTask(args: js.Any*): js.Any = js.native
    
    def isWorkflow(args: js.Any*): js.Any = js.native
    
    def setProcessor(args: js.Any*): js.Any = js.native
  }
  
  object Errors {
    
    object EnvironmentNotSetError {
      
      inline def apply(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
      
      @JSImport("zenaton", "Errors.EnvironmentNotSetError")
      @js.native
      val ^ : js.Any = js.native
      
      inline def captureStackTrace(p0: js.Any, p1: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("captureStackTrace")(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any])).asInstanceOf[js.Any]
      
      @JSImport("zenaton", "Errors.EnvironmentNotSetError.stackTraceLimit")
      @js.native
      val stackTraceLimit: Double = js.native
    }
    
    object ExternalZenatonError {
      
      inline def apply(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
      
      @JSImport("zenaton", "Errors.ExternalZenatonError")
      @js.native
      val ^ : js.Any = js.native
      
      inline def captureStackTrace(p0: js.Any, p1: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("captureStackTrace")(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any])).asInstanceOf[js.Any]
      
      @JSImport("zenaton", "Errors.ExternalZenatonError.stackTraceLimit")
      @js.native
      val stackTraceLimit: Double = js.native
    }
    
    object InternalZenatonError {
      
      inline def apply(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
      
      @JSImport("zenaton", "Errors.InternalZenatonError")
      @js.native
      val ^ : js.Any = js.native
      
      inline def captureStackTrace(p0: js.Any, p1: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("captureStackTrace")(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any])).asInstanceOf[js.Any]
      
      @JSImport("zenaton", "Errors.InternalZenatonError.stackTraceLimit")
      @js.native
      val stackTraceLimit: Double = js.native
    }
    
    object InvalidArgumentError {
      
      inline def apply(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
      
      @JSImport("zenaton", "Errors.InvalidArgumentError")
      @js.native
      val ^ : js.Any = js.native
      
      inline def captureStackTrace(p0: js.Any, p1: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("captureStackTrace")(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any])).asInstanceOf[js.Any]
      
      @JSImport("zenaton", "Errors.InvalidArgumentError.stackTraceLimit")
      @js.native
      val stackTraceLimit: Double = js.native
    }
    
    object ModifiedDeciderError {
      
      inline def apply(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
      
      @JSImport("zenaton", "Errors.ModifiedDeciderError")
      @js.native
      val ^ : js.Any = js.native
      
      inline def captureStackTrace(p0: js.Any, p1: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("captureStackTrace")(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any])).asInstanceOf[js.Any]
      
      @JSImport("zenaton", "Errors.ModifiedDeciderError.stackTraceLimit")
      @js.native
      val stackTraceLimit: Double = js.native
    }
    
    object ScheduledBoxError {
      
      inline def apply(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
      
      @JSImport("zenaton", "Errors.ScheduledBoxError")
      @js.native
      val ^ : js.Any = js.native
      
      inline def captureStackTrace(p0: js.Any, p1: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("captureStackTrace")(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any])).asInstanceOf[js.Any]
      
      @JSImport("zenaton", "Errors.ScheduledBoxError.stackTraceLimit")
      @js.native
      val stackTraceLimit: Double = js.native
    }
    
    object ZenatonError {
      
      inline def apply(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
      
      @JSImport("zenaton", "Errors.ZenatonError")
      @js.native
      val ^ : js.Any = js.native
      
      inline def captureStackTrace(p0: js.Any, p1: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("captureStackTrace")(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any])).asInstanceOf[js.Any]
      
      @JSImport("zenaton", "Errors.ZenatonError.stackTraceLimit")
      @js.native
      val stackTraceLimit: Double = js.native
    }
  }
  
  @JSImport("zenaton", "LastClient")
  @js.native
  class LastClient protected () extends StObject {
    def this(args: js.Any*) = this()
    
    def findWorkflow(args: js.Any*): js.Any = js.native
    
    def getAppEnv(args: js.Any*): js.Any = js.native
    
    def getBodyForTask(args: js.Any*): js.Any = js.native
    
    def getBodyForWorkflow(args: js.Any*): js.Any = js.native
    
    def getWebsiteUrl(args: js.Any*): js.Any = js.native
    
    def getWorkerUrl(args: js.Any*): js.Any = js.native
    
    def getWorkerUrlNew(args: js.Any*): js.Any = js.native
    
    def killWorkflow(args: js.Any*): js.Any = js.native
    
    def mustBeScheduled(args: js.Any*): js.Any = js.native
    
    def pauseWorkflow(args: js.Any*): js.Any = js.native
    
    def resumeWorkflow(args: js.Any*): js.Any = js.native
    
    def sendEvent(args: js.Any*): js.Any = js.native
    
    def sendEventByInstanceId(args: js.Any*): js.Any = js.native
    
    def startInstantTask(args: js.Any*): js.Any = js.native
    
    def startInstantWorkflow(args: js.Any*): js.Any = js.native
    
    def startScheduledTask(args: js.Any*): js.Any = js.native
    
    def startScheduledWorkflow(args: js.Any*): js.Any = js.native
    
    def startTask(args: js.Any*): js.Any = js.native
    
    def startWorkflow(args: js.Any*): js.Any = js.native
    
    def updateInstance(args: js.Any*): js.Any = js.native
  }
  /* static members */
  object LastClient {
    
    @JSImport("zenaton", "LastClient")
    @js.native
    val ^ : js.Any = js.native
    
    inline def init(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  }
  
  @JSImport("zenaton", "Parallel")
  @js.native
  class Parallel protected () extends StObject {
    def this(args: js.Any*) = this()
    
    def dispatch(args: js.Any*): js.Any = js.native
    
    def execute(args: js.Any*): js.Any = js.native
  }
  
  inline def Task(name: js.Any, task: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("Task")(name.asInstanceOf[js.Any], task.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def Version(name: js.Any, implementation: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("Version")(name.asInstanceOf[js.Any], implementation.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @JSImport("zenaton", "Wait")
  @js.native
  class Wait protected () extends StObject {
    def this(args: js.Any*) = this()
    
    def at(args: js.Any*): js.Any = js.native
    
    def dayOfMonth(args: js.Any*): js.Any = js.native
    
    def days(args: js.Any*): js.Any = js.native
    
    def friday(args: js.Any*): js.Any = js.native
    
    def hours(args: js.Any*): js.Any = js.native
    
    def minutes(args: js.Any*): js.Any = js.native
    
    def monday(args: js.Any*): js.Any = js.native
    
    def months(args: js.Any*): js.Any = js.native
    
    def saturday(args: js.Any*): js.Any = js.native
    
    def seconds(args: js.Any*): js.Any = js.native
    
    def sunday(args: js.Any*): js.Any = js.native
    
    def thursday(args: js.Any*): js.Any = js.native
    
    def timestamp(args: js.Any*): js.Any = js.native
    
    def tuesday(args: js.Any*): js.Any = js.native
    
    def wednesday(args: js.Any*): js.Any = js.native
    
    def weeks(args: js.Any*): js.Any = js.native
    
    def years(args: js.Any*): js.Any = js.native
  }
  /* static members */
  object Wait {
    
    @JSImport("zenaton", "Wait")
    @js.native
    val ^ : js.Any = js.native
    
    inline def methods(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("methods")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    inline def timezone(timezone: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("timezone")(timezone.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  }
  
  inline def Workflow(name: js.Any, flow: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("Workflow")(name.asInstanceOf[js.Any], flow.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  object infos {
    
    @JSImport("zenaton", "infos")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("zenaton", "infos.appVersion")
    @js.native
    def appVersion: String = js.native
    inline def appVersion_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("appVersion")(x.asInstanceOf[js.Any])
    
    @JSImport("zenaton", "infos.codePath")
    @js.native
    def codePath: String = js.native
    inline def codePath_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("codePath")(x.asInstanceOf[js.Any])
  }
  
  object serializer {
    
    @JSImport("zenaton", "serializer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("zenaton", "serializer.CURRENT_VERSION")
    @js.native
    val CURRENT_VERSION: String = js.native
    
    inline def decode(data: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(data.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    inline def encode(data: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(data.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  }
  
  object taskManager {
    
    @JSImport("zenaton", "taskManager")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getClass_(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getClass")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    inline def getTask(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getTask")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    inline def setClass(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("setClass")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  }
  
  object workflowManager {
    
    @JSImport("zenaton", "workflowManager")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getClass_(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getClass")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    inline def getWorkflow(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getWorkflow")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    inline def setClass(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("setClass")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  }
}
