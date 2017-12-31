using System.ServiceModel;
using WCF.Constracts;

namespace BAL
{
    public class ExceptionUtil
    {
        public FaultException<ParameterExceptionIsNull> GetFaltException(string exceptionMessage)
        {
            ParameterExceptionIsNull parameterException = new ParameterExceptionIsNull();
            parameterException.Message = exceptionMessage;

            return new FaultException<ParameterExceptionIsNull>(parameterException, new FaultReason(parameterException.Message));
        }
    }
}
