package DiamonShop.Controller.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import DiamonShop.Dao.SlidesDao;
import DiamonShop.Service.User.HomeServiceImpl;

@Controller
public class HomeController extends BaseController{
	@Autowired
	HomeServiceImpl HomeService;
	
	@RequestMapping(value = { "/", "/trang-chu" })
	public ModelAndView Index() {
		//ModelAndView mv = new ModelAndView("user/index");
		_mvShare.addObject("slides", _homeService.GetDataSlide());
		_mvShare.addObject("categorys", _homeService.GetDataCategorys());
		_mvShare.addObject("products", _homeService.GetDataProducts());
		_mvShare.addObject("new_product", _homeService.GetDataProducts());
		_mvShare.addObject("highlight", _homeService.GetDataProducts());
		_mvShare.setViewName("user/index");
		return _mvShare;
	}

	@RequestMapping(value = "/product")
	public ModelAndView Product() {
		ModelAndView mv = new ModelAndView("user/product");
		return mv;
	}
}