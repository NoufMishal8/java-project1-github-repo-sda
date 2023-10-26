//p ackage com.example.NSalon.Controller;
//
//
//
//import com.example.NSalon.Service.Interface.CustomerServiceInterface;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@RestController
//public class CustomerController {
//    @Autowired
//    private CustomerServiceImpl customerService;

//    @GetMapping("/AvailableS")
//    public ResponseEntity<List<ServiceInfo>> getAvailableServices() {
//        List<ServiceInfo> availableServices = customerService.getAvailableServices();
//        return ResponseEntity.ok(availableServices);
//    }

