using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Oes.Entity
{
    public class UserNameNotExistException : Exception
    {
        public UserNameNotExistException() : base()
        {
        }

        public UserNameNotExistException(string message)
            : base(message)
        {
        }

        public UserNameNotExistException(string message, Exception innerException)
            : base(message, innerException)
        {
        }
    }
}
